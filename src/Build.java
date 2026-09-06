void main() {
        IO.println("Building...");
        var javac = ToolProvider.findFirst("javac").get();
        javac.run(System.out, System.err, "--release", "17", "--class-path", "lib/aplu5.jar", "-d", "classes", "src/Chessboard.java");
        var jar = ToolProvider.findFirst("jar").get();
        jar.run(System.out, System.err, "--create", "--file", "apluground.jar", "--main-class", "Chessboard", "-C", "classes", ".");
    }