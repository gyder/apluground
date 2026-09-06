import ch.aplu.util.*;

class Chessboard extends GPanel {
    Chessboard() {
        window(0, 8, 0, 8);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 0)
                    fillRectangle(i, j, i + 1, j + 1);
    }

    static void main(String[] args) {
        new Chessboard();
    }
}