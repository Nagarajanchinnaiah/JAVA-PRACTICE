class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        // Pre-increment
        System.out.println("Pre-increment (++num) = " + (++num));

        // Post-increment
        System.out.println("Post-increment (num++) = " + (num++));
        System.out.println("Value after post-increment = " + num);

        // Pre-decrement
        System.out.println("Pre-decrement (--num) = " + (--num));

        // Post-decrement
        System.out.println("Post-decrement (num--) = " + (num--));
        System.out.println("Value after post-decrement = " + num);
    }
}