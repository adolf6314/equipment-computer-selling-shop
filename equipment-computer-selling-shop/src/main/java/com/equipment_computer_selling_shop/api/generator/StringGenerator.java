package com.equipment_computer_selling_shop.api.generator;

public class StringGenerator {
	
	private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "0123456789";
	private static final String SYMBOLS = "_-";

	public static String generateId(String latestId) {
		
		if (latestId == null) return "";
		
        String numbers = latestId.replaceAll("[^0-9]", "");
        String upperCase = latestId.replaceAll("[^A-Z]", "");

        if (numbers.equals("9999999999")) {

            char[] chars = upperCase.toCharArray();

            for (int i = upperCase.length() - 1; i > -1; i--) {

                if (upperCase.charAt(i) == UPPERCASE.charAt(UPPERCASE.length() - 1)) {
                    
                    if (i < 1)
                        chars = (upperCase.replaceAll("[A-Z]", UPPERCASE.charAt(0) + "") + UPPERCASE.charAt(0))
                                .toCharArray();
                    else
                        chars[i] = UPPERCASE.charAt(0);

                } else {

                    chars[i] = UPPERCASE.charAt(UPPERCASE.indexOf(upperCase.charAt(i) + 1));
                    break;

                }
            }

            upperCase = new String(chars);
            numbers = "0000000001";

        } else {

            int number = Integer.parseInt(numbers) + 1;

            numbers = String.format("%010d", number);

        }
        
        return upperCase + numbers;
        
	}
	
	public static String generateToken(int length) {
		
		return"";
	}

}
