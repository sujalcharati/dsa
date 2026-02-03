func isValid(s string) bool {

    var s1 []byte

    if len(s) == 1 || len(s) == 0{
        return false
    }
    for i:= 0; i < len(s) ; i++ {
        
        if s[i] == '(' || s[i] == '{' || s[i] == '[' {

            s1 = append(s1,s[i])

        } 
         if s[i] == ')' || s[i] == '}' || s[i] == ']'{

            if len(s1) == 0  {
                return false
            }

            top := s1[ len(s1)-1]

            if s[i]==')' && top == '(' ||  s[i]=='}' && top == '{' ||  s[i]==']' && top == '[' {
                s1 = s1[:len(s1)-1]
            } else {
                return false
            }

         } 
    }


    return len(s1) == 0    
}