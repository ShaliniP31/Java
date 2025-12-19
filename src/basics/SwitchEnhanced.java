package basics;

public class SwitchEnhanced {
    public static void main(String[] args) {
        int code = 600;
        traditionalSwitch(code);
        switchCaseList(code);
        switchWithYield(code);
        switchWithArrowCase(code);
        switchWithBlockArrowCase(code);
        switchWithoutValue(code);
    }

    public static void traditionalSwitch(int code) {
        int priorityLevel;
        switch (code) {
            case 100:
            case 200:
                priorityLevel = 1;
                break;
            case 300:
            case 400:
                priorityLevel = 2;
                break;
            case 500:
            case 600:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 4;
                break;
        }
        System.out.println("Priority Level for code " + code + " is " + priorityLevel);
    }

    public static void switchCaseList(int code) {
        int priorityLevel;
        switch (code) {
            case 100, 200:
                priorityLevel = 1;
                break;
            case 300, 400:
                priorityLevel = 2;
                break;
            case 500, 600:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 4;
                break;
        }
        System.out.println("Priority Level for code " + code + " is " + priorityLevel);
    }

    public static void switchWithYield(int code) {
        int priorityLevel = switch (code) {
            case 100, 200:
                yield 1;
            case 300, 400:
                yield 2;
            case 500, 600:
                yield 3;
            default:
                yield 4;
        };
        System.out.println("Priority Level for code " + code + " is " + priorityLevel);
    }

    public static void switchWithArrowCase(int code) {
        int priorityLevel = switch (code) {
            case 100, 200 -> 1;
            case 300, 400 -> 2;
            case 500, 600 -> 3;
            default -> 4;
        };
        System.out.println("Priority Level for code " + code + " is " + priorityLevel);
    }

    public static void switchWithBlockArrowCase(int code) {
        int priorityLevel = switch (code) {
            case 100, 200 -> {
                System.out.println("Danger");
                yield 1;
            }
            case 300, 400 -> {
                System.out.println("Serious");
                yield 2;
            }
            case 500, 600 -> {
                System.out.println("Caution");
                yield 3;
            }
            default -> {
                System.out.println("Normal");
                yield 4;
            }
        };
        System.out.println("Priority Level for code " + code + " is " + priorityLevel);
    }

    public static void switchWithoutValue(int code) {
        int i = 0, j = 0;
        switch (code) {
            case 100, 200 -> i++;
            case 300, 400 -> i += 2;
            case 500, 600 -> j++;
            default -> j += 2;
        }
        System.out.println(i + " " + j);
    }
}
