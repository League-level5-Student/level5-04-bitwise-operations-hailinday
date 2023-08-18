package _03_Printing_Binary;

import java.util.Iterator;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */
	
    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
        // Shift b seven bits to the right
    
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	
        // Print the result using System.out.print (NOT System.out.println)
    	
    	//Use this method to print the remaining 7 bits of b
    	for (int i = 7; i >= 0; i--) {
			System.out.print((b >>> i) & 1);
		}
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	byte oneB = 0;
    	byte twoB = 0;
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	twoB = (byte) (s & 0b11111111);
    	oneB = (byte) (s >> 8);
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	printByteBinary(oneB);
    	printByteBinary(twoB);
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short oneS=0;
    	short twoS=0;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	twoS = (short) (i & 0b1111111111111111);
    	oneS = (short) (i >> 16);
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	printShortBinary(oneS);
    	printShortBinary(twoS);
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int twoI=0;
    	int oneI = 0;
    	
    	twoI = (int) (l & 0xFFFFFFFF);
    	oneI = (int) (l >> 32);
    	
    	printIntBinary(oneI);
    	printIntBinary(twoI);
    }

    public static void main(String[] args) {
        // Test your methods here
    	printByteBinary((byte) 10);
    	System.out.println();
    	printShortBinary((short) 10);
    	System.out.println();
    	printIntBinary((int) 10);
    	System.out.println();
    	printLongBinary((long) 10);
    }
}
