// find difference between the sum of squares and square of sums for [1..100]

package main

import (
	"fmt"
)

func main() {
	sumsquare := 0
	squaresum := 0
	for i := 1; i <= 100; i++ {
		sumsquare += i * i
		squaresum += i
	}
	fmt.Println("Sum of squares")
	fmt.Println((squaresum * squaresum) - sumsquare)
}
