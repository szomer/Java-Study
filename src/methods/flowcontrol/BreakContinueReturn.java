package methods.flowcontrol;

class BreakContinueReturn {

    public static void main(String[] args){
        BreakContinueReturn x = new BreakContinueReturn();
        x.breakStatement();
        x.continueStatement();
        x.returnStatement();
    }

    private void breakStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End");
        // output: 0, 1, 2, 3, End
    }

    private void continueStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("End");
        // output: 0, 1, 2, 3, 5, 6, 7, 8, 9, End
    }

    private void returnStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("End");
        // output: 0, 1, 2, 3
    }
}
