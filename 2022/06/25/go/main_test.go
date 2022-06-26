/**
 * The Go Programming Language: Section 4.3
 * Author: Andrew Jarombek
 * Date: 6/25/2022
 */

package _go

import (
	"fmt"
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test(t *testing.T) {
	// The following two map initializers are equivalent
	runs := make(map[string]float64)
	runs["6/24/2022"] = 4.87
	runs["6/25/2022"] = 5.02

	runs2 := map[string]float64{
		"6/24/2022": 4.87,
		"6/25/2022": 5.02,
	}

	assert.Equal(t, 2, len(runs2))

	// Can't call capacity (cap()) on a map
	// assert.Equal(t, 2, cap(runs2))

	// Remove a key->value pair from the map
	delete(runs2, "6/24/2022")
	assert.Equal(t, 1, len(runs2))

	// Increment/decrement operators work on maps (Go is the only language I know that allows this)
	runs2["6/25/2022"]++
	assert.Equal(t, 6.02, runs2["6/25/2022"])

	runs2["6/25/2022"]--
	assert.Equal(t, 5.02, runs2["6/25/2022"])

	// Same with shorthand assignment
	runs2["6/25/2022"] += 10
	assert.Equal(t, 15.02, runs2["6/25/2022"])

	for key, value := range runs2 {
		runs2[key] = value + 1
	}

	assert.Equal(t, 16.02, runs2["6/25/2022"])

	// nil maps are uninitialized and cant have key->value pairs stored in it
	var nilMap map[int32]bool
	assert.Nil(t, nilMap)

	// Not allowed
	// nilMap[5] = true

	// If a key is not in the map, the default value of the 'value' is returned when subscripting.
	// In the below example, the key '' does not exist, so the default value
	//of the float64 type is returned (0.0).
	assert.Equal(t, 0.0, runs2["6/26/2022"])

	// If you want to see if the key isn't in the map, use the second returned value when subscripting a map.
	key := "6/26/2022"
	if _, ok := runs2[key]; !ok {
		fmt.Printf("key does not exist: %s", key)
	} else {
		panic("Expected key to not exist")
	}

	// maps can be used as the keys of maps, creating nested map structures.
	nestedMap := make(map[string]map[string]float64)

	innerMap := nestedMap["6/19/2022"]
	innerMap = make(map[string]float64)
	nestedMap["6/19/2022"] = innerMap

	innerMap["run"] = 12.86
	innerMap["walk"] = 4.45

	assert.Equal(t, 12.86, nestedMap["6/19/2022"]["run"])
	assert.Equal(t, 4.45, nestedMap["6/19/2022"]["walk"])
}