/**
 * The Go Programming Language: Exercises 2.2.  Package for a distance metric conversion utility.
 * Author: Andrew Jarombek
 * Date: 5/22/2022
 */

package conv

import "fmt"

type Mile float64
type Kilometer float64
type Meter float64

const (
	MarathonKm Kilometer = 42.195
	MarathonM Meter = 42_195
	MarathonMi Mile = 26.219
)

func (mi Mile) String() string {
	return fmt.Sprintf("%gmi", mi)
}

func (km Kilometer) String() string {
	return fmt.Sprintf("%gkm", km)
}

func (m Meter) String() string {
	return fmt.Sprintf("%gm", m)
}

func miToKm(mile Mile) Kilometer {
	return Kilometer(mile / 0.621317)
}

func miToM(mile Mile) Meter {
	return Meter(mile / 621.317)
}

func kmToMi(kilometer Kilometer) Mile {
	return Mile(kilometer * 0.621317)
}

func kmToM(kilometer Kilometer) Meter {
	return Meter(kilometer * 1000)
}

func mToKm(meter Meter) Kilometer {
	return Kilometer(meter / 1000)
}

func mToMi(meter Meter) Mile {
	return Mile(meter * 621.317)
}