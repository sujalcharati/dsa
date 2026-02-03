package main

import "fmt"

func priority(op byte) int {
    switch op {
    case '+', '-':
        return 1
    case '*', '/':
        return 2
    case '^':
        return 3
    }
    return 0
}

func infix_to_postfix(s string) string {
    var stack []byte
    ans := ""

    for i := 0; i < len(s); i++ {
        ch := s[i]

        if (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') {
            ans += string(ch)
        } else if ch == '(' {
            stack = append(stack, ch)
        } else if ch == ')' {
            for len(stack) > 0 && stack[len(stack)-1] != '(' {
                ans += string(stack[len(stack)-1])
                stack = stack[:len(stack)-1]
            }
            if len(stack) > 0 {
                stack = stack[:len(stack)-1]
            }
        } else {
            for len(stack) > 0 && priority(stack[len(stack)-1]) >= priority(ch) {
                ans += string(stack[len(stack)-1])
                stack = stack[:len(stack)-1]
            }
            stack = append(stack, ch)
        }
    }

    for len(stack) > 0 {
        ans += string(stack[len(stack)-1])
        stack = stack[:len(stack)-1]
    }

    return ans
}

func main() {
    s := "a+b*(c^d-e)"
    fmt.Println("Infix:   ", s)
    fmt.Println("Postfix: ", infix_to_postfix(s))
}
