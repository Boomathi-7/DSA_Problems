class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        int rem = n;
        boolean turn = true;
        while (rem >= remove){
            rem -= remove;
            remove--;
            turn = !turn;
        }
        return !turn;
    }
}
