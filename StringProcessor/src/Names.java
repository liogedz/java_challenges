public record Names(

        String firstName,
        String lastName
) {

    public Names {
        if (firstName == null || lastName == null) {
            throw new NullPointerException("Fields cannot be null");
        }
    }
}
