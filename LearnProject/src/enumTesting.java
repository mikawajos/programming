import javax.swing.*;

public class enumTesting {

    public enum childrenList {
        SZYMON, KUBA, KASIA, ZOSIA, BASIA, HANIA;

        public boolean isOnList(){
            switch (this) {
                case SZYMON:
                    return true;
                case KUBA:
                    return true;
                case BASIA:
                    return true;
                case HANIA:
                    return true;
                case KASIA:
                    return true;
                case ZOSIA:
                    return true;
                    default:
                        return false;
            }
        }
    }

    public enum Week {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;

        Action action;
        case Sunda
    }

    public static void main(String[] args) {

        for (childrenList childrens : childrenList.values()){
                System.out.println(childrens);
        }

        final Week today = getToday();
    }
}
