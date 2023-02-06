package com.kutterthornton.cs.Unit9.Lab8;

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
        StringRemover test = new StringRemover("xR-MxR-MHelloxR-M","R-M");
        out.println(test);

        test.setRemover("sxsssxssxsxssexssxsesss", "xs");
        out.println(test);

        test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
        out.println(test);
	}
}
