package array


// this is the approach of O(n^2):

func firstUniqChar(s string) int {

    for i:= 0 ; i < len(s); i++ {
        f:= 0

        for j:= 0 ; j< len(s); j++ {

            if s[i] ==  s[j] {
                f++
            }
        }

        if f == 1 {
            return i
        }
    }    

    return -1
}



// this is O(n) approach using map...

func firstUniqChar(s string) int {

    f := make(map[rune]int)
func firstUniqChar(s string) int {

    f := make(map[rune]int)

    for _,ch := range s {
        f[ch]++
    }
func firstUniqChar(s string) int {

    f := make(map[rune]int)

    for _,ch := range s {
        f[ch]++
    }

    for i, ch := range s {

        if f[ch] == 1 {
            return i
        }
    }
    return -1
}
    for i, ch := range s {

        if f[ch] == 1 {
            return i
        }
    }
    return -1
}
    for _,ch := range s {
        f[ch]++
    }

    for i, ch := range s {

        if f[ch] == 1 {
            return i
        }
    }
    return -1
}