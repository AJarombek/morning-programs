/**
 * https://leetcode.com/problems/jewels-and-stones/
 * @author Andrew Jarombek
 * @since 4/23/2022
 */

// If I’m wrong, I’m sorry.  It’s been so long, it’s difficult for my mind to find explanations
// other than you not wanting to speak to me again,
// even as my heart tries to hold on to words and letters and feelings from long ago.

// If I’m wrong, please, somehow, someway, trust me with the truth.  I want to live my life with the truth
// there to guide me.  I love you.  You, Jacqui, are the kindest person I have met in my life, and you’ve treated me
// so well and made me feel so loved (even though I know you feel like you haven't always).  The truth of your life,
// your feelings, my life, my feelings, is what will get us where we want to go.

// If I was correct in what I said yesterday, you can ignore me.  What I want most of all is your happiness.

function numJewelsInStones(jewels: string, stones: string): number {
    let set = new Set<string>();

    for (let jewel of jewels) {
        set.add(jewel);
    }

    let count = 0;

    for (let stone of stones) {
        if (set.has(stone)) {
            count++;
        }
    }

    return count;
}
