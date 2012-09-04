// What is the smallest positive number that is evenly divisible by all
// of the numbers from 1 to 20?

// find the prime factors of all the numbers, take the union

package main

import (
	"fmt"
	"math"
)

func factors(x int) map[int]int {
	m := make(map[int]int)
	for i,j := 2,x; i <= j; {
		if j % i == 0  {
			m[i] += 1
			j /= i
		} else {
			i++
		}
	}
	return m
}

func union(x,y map[int]int) map[int]int {
	for k,v := range x {
		y[k] = int(math.Max(float64(v), float64(y[k])))
	}
	return y
}

func main() {
	m := make(map[int]int)
	for i := 2; i < 20; i++ {
		m = union(factors(i), m)
	}
	prod := 1
	for k,v := range m {
		prod *= int(math.Pow(float64(k),float64(v)))
	}
	fmt.Println(prod)
}
