class sum_integer {
    public static void main(String[] args) {
        String s1[] = {"67", "89", "23", "67", "12", "55", "66"};
        
        int sum = 0;
        for(int i=0;i<s1.length;i++)
        {
            int num = Integer.parseInt(s1[i]);
            sum+=num;
        }
        System.out.println("Sum = "+sum);
    }
    
}
