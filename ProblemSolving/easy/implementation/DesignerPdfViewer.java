package easy.implementation;

import java.util.*;

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?h_r=next-challenge&h_v=zen&isFullScreen=false

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {

        // Write your code here
        List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < letters.size(); i++) {
            map.put(letters.get(i), i);

        }

        int maxHeight = 0;
        for (Character ch : word.toCharArray()) {
            Integer index = map.get(ch);
            Integer height = h.get(index);
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return word.length() * maxHeight;

    }

    public static void main(String[] args) {

    }
}
