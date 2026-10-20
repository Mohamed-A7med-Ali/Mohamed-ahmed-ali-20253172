static String extractDomain(String email) {
    email = email.trim();

    int pos = email.indexOf('@');

    if (pos == -1) {
        return "Invalid Email";
    }

    return email.substring(pos + 1).toLowerCase();
}