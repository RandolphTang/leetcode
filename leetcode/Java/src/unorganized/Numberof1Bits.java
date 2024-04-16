package unorganized;

public class Numberof1Bits1 {

    public int hammingWeight(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1) == 1){
                //n >> i: moving bits to right i positions
                // & 1: check right-most bit as 1 or 0
                // & 0: all turn to 0
                ans++;
            }
        }
        return ans;
    }

}

//To set a specific bit (e.g., the third bit) to 1:
//int modifiedNumber = originalNumber | (1 << 2);

//Toggling a Specific Bit:
//int modifiedNumber = originalNumber ^ (1 << 1);

//Clearing a Specific Bit:
//int modifiedNumber = originalNumber & ~(1);

//Checking the Value of a Specific Bit:
//int bitValue = (originalNumber >> 0) & 1;

//Setting Multiple Bits:
//int mask = (1 << 2) | (1 << 4) | (1 << 6);
//int modifiedNumber = originalNumber | mask;

//Clearing Multiple Bits:
//int mask = ~(1 << 2) & ~(1 << 4) & ~(1 << 6);
//int modifiedNumber = originalNumber & mask;