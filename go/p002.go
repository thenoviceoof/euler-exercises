// generate fib sequence until 4 million, add up even values

package main

import "fmt"

const limit = 4000000

func main() {
	sum := 0
	for i,j := 1,2; j < limit; i,j = j,i+j {
		if j % 2 == 0 {
			sum += j
		}
	}
	fmt.Println(sum)
}