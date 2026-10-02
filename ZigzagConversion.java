class LC6_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        String[] b = new String[numRows];

        for (int i = 0; i < numRows; i++)
            b[i] = "";

        int r = 0;
        boolean down = false;

        for (char ch : s.toCharArray()) {
            b[r] += ch;

            if (r == 0 || r == numRows - 1)
                down = !down;

            r += down ? 1 : -1;
        }

        String z = "";

        for (String x : b)
            z += x;

        return z;
    }
}