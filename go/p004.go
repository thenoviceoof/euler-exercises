// largest palindrome from product of two 3-digit numbers

package main

import (
	"fmt"
)

func palindrome(x int) bool {
	p := fmt.Sprint(x)
	for i := 0; i < len(p); i++ {
		if p[i] != p[len(p)-i-1] {
			return false
		}
	}
	return true
}

func main() {
	prod := 0
	for i,j := 1,1; i < 1000 && j < 1000; i += 1 {
		if palindrome(i*j) && i*j > prod{
			prod = i*j
		}
		if i == 999 {
			i = 0
			j += 1
		}
	}
	fmt.Println(prod)
}