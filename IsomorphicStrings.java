class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);

            if (s.indexOf(c) != t.indexOf(d))
                return false;
        }

        return true;
    }
}