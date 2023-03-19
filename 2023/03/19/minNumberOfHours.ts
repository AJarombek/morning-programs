/**
 * https://leetcode.com/problems/minimum-hours-of-training-to-win-a-competition/
 * @author Andrew Jarombek
 * @since 3/19/2023
 */

function minNumberOfHours(initialEnergy: number, initialExperience: number, energy: number[], experience: number[]): number {
    let result = 0;

    for (let i = 0; i < energy.length; i++) {
        const eng = energy[i];
        const exp = experience[i];

        if (initialEnergy <= eng) {
            result += eng - initialEnergy + 1;
            initialEnergy = 1;
        } else {
            initialEnergy -= eng;
        }

        if (initialExperience <= exp) {
            const val = exp - initialExperience + 1;
            result += val;
            initialExperience += val;
        }

        initialExperience += exp;
    }

    return result;
}