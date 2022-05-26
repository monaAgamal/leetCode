class Solution {

    public int romanToInt(String s) {
        String[] array = s.split("");
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            
            if (i < array.length - 1 && array[i].equals("I") && (array[i + 1].equals("V") || array[i + 1].equals("X"))) {
                nums.add(-1);
            continue ; 
            }
            if (i < array.length - 1 && array[i].equals("X") && (array[i + 1].equals("L") || array[i + 1].equals("C"))) {
                nums.add(-10);
           continue ; 
            }
            if (i < array.length - 1 && array[i].equals("C") && (array[i + 1].equals("D") || array[i + 1].equals("M"))) {
                nums.add(-100);
           continue ; 
            }
            
        
            nums.add(Solution.convertStringToInt(array[i]));
        }

        int val = nums.size() - 1;
        int sum = 0;
        while (val>=0) {
            sum += nums.get(val);
            val--;
        }
        return sum;
    }

    static int convertStringToInt(String charrrrr) {
        System.out.print("charrrrr is " + charrrrr);
        if (charrrrr.equals("I")) {
            System.out.print("in I scope ");
            return 1;
        } else if (charrrrr.equals("V")) {
            return 5;
        } else if (charrrrr.equals("X")) {
            return 10;
        } else if (charrrrr.equals("L")) {
            return 50;
        } else if (charrrrr.equals("C")) {
            return 100;
        } else if (charrrrr.equals("D")) {
            return 500;
        } else if (charrrrr.equals("M")) {
            return 1000;
        } else {
            return 0;
        }
    }
}
