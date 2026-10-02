class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch))
                r += Character.toLowerCase(ch);
        }

        String rev = "";

        for (int i = r.length() - 1; i >= 0; i--)
            rev += r.charAt(i);

        return r.equals(rev);
    }
}