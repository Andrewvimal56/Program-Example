package org.example;

public abstract class ExampleProgram {
	public static void main(String[] args) {
		String s = "Opera refers to a dramatic art form, originating in Europe, in which the emotional content is conveyed to the audience as much through music, both vocal and instrumental, as it is through the lyrics.";
		s = s.toLowerCase();
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String currentWord = split[i];
			System.out.println("currentWord: " + currentWord);
			int count = 1;
			for (int j = 0; j < currentWord.length(); j++) {
				char currentLetter = currentWord.charAt(j);
				System.out.println("currentLetter: " + currentLetter);
				for (int x = j + 1; x < currentWord.length(); x++) {
					if (currentLetter == currentWord.charAt(x)) {
						count++;
						System.out.println("Duplicate Occured for letter: " + currentLetter);
					}
				}
			}
//		   char charArray[] = s.toCharArray();
//			for (int j = 0; j < charArray.length; j++) {
//				count=1;
//				for (int j2 = i+1; j2 < charArray.length; j2++) {
//					if(charArray[j]==charArray[j2]) {
//						count++;
//						charArray[j2]=0;
//					}
//				}
//				if(count<1&&charArray[j]!='0') {
//					System.out.println(charArray[j]);
//				}
//			}
		}

	}
}
