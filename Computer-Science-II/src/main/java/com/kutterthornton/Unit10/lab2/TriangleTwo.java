package com.kutterthornton.Unit10.lab2;

// ═══════════════════════════⟦ 𝝨 ⟧═════════════════════════════
//					  Kutter Thornton © 2023
//						All Rights Reserved
// ═══════════════════════════⟦ 𝝨 ⟧═════════════════════════════

public class TriangleTwo
{
	private int size;
	private String letter;

	public TriangleTwo()
	{
		size = 0;
		letter = "";
	}

	public TriangleTwo( String let, int sz)
	{
		size = sz;
		letter = let;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		// Make a trangle with the letter and size given but reversed
		for (int i = size; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				output += letter;
			}
			output += "\n";
		}

		return output+"\n";
	}
}