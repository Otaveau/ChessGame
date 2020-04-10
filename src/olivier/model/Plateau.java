package olivier.model;

public class Plateau {

    private Piece [][] plateau;

    public Plateau() {

        this.plateau = new Piece[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                plateau[i][j] = null;
            }
        }

        // Noirs
        plateau [0][0] = new Piece("file:images/tourNoir.png", "Noir");
        plateau [1][0] = new Piece("file:images/cavalierNoir.png", "Noir");
        plateau [2][0] = new Piece("file:images/fouNoir.png", "Noir");
        plateau [3][0] = new Piece("file:images/roiNoir.png", "Noir");
        plateau [4][0] = new Piece("file:images/reineNoir.png", "Noir");
        plateau [5][0] = new Piece("file:images/fouNoir.png", "Noir");
        plateau [6][0] = new Piece("file:images/cavalierNoir.png", "Noir");
        plateau [7][0] = new Piece("file:images/tourNoir.png", "Noir");
        plateau [0][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [1][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [2][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [3][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [4][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [5][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [6][1] = new Piece("file:images/pionNoir.png", "Noir");
        plateau [7][1] = new Piece("file:images/pionNoir.png", "Noir");

        plateau [0][7] = new Piece("file:images/tourBlanc.png", "Blanc");
        plateau [1][7] = new Piece("file:images/cavalierBlanc.png", "Blanc");
        plateau [2][7] = new Piece("file:images/fouBlanc.png", "Blanc");
        plateau [3][7] = new Piece("file:images/roiBlanc.png", "Blanc");
        plateau [4][7] = new Piece("file:images/reineBlanc.png", "Blanc");
        plateau [5][7] = new Piece("file:images/fouBlanc.png", "Blanc");
        plateau [6][7] = new Piece("file:images/cavalierBlanc.png", "Blanc");
        plateau [7][7] = new Piece("file:images/tourBlanc.png", "Blanc");
        plateau [0][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [1][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [2][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [3][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [4][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [5][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [6][6] = new Piece("file:images/pionBlanc.png", "Blanc");
        plateau [7][6] = new Piece("file:images/pionBlanc.png", "Blanc");

    }

    public Piece[][] getPlateau() {
        return plateau;
    }
}
