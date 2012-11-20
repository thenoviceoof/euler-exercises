// find the 10001st prime
// using a sieve stolen from http://golang.org/doc/play/sieve.go

package main

import (
	"fmt"
)

func Generate(gen chan int) {
	for i := 2; ; i++ {
		gen <- i
	}
}

func Filter(prime int, ch, nch chan int) chan int {
	for c := range ch {
		if c%prime != 0 {
			nch <- c
		}
	}
	return nch
}

func main() {
	ch := make(chan int)
	go Generate(ch)
	for i := 1; i < 10001; i++ {
		prime := <-ch
		// fmt.Println(prime)
		fmt.Println(i)
		ch1 := make(chan int)
		go Filter(prime, ch, ch1)
		ch = ch1
	}
	fmt.Println(<-ch)
}
