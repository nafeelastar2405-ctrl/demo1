/*public class day14_factory {
    interface Notification {

            void send(String to, String message);
            }
    class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email:" + message + ",to" + to);
        }
    }
    class WhatsappNotification implements Notification{
                @Override
                public void send (String to,String message){
                    System.out.println("Sending Whatsapp:"+message+",to"+to);
                }
                static Notification getNotification(day14_factory factory ,String type) {
                    return switch (type) {
                        case "Email" -> factory.new EmailNotification();
                        case "Whatsapp" -> factory.new WhatsappNotification();
                        default -> throw new IllegalArgumentException("Invalid notification type: " + type);
                    };
                }

                static void main() {
                    day14_factory factory=new day14_factory();
                    String type="Email";
                    getNotification(factory,type).send("240824","Hi Layaha");
                }
            }

        }
*/
/*public class day14_factory {

    interface Notification {
        void send(String to, String message);
    }

    class CreditNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Credit: " + message + ", to " + to);
        }
    }

    class DebitNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Debit: " + message + ", to " + to);
        }
    }

    static Notification getNotification(day14_factory factory, String type) {
        return switch (type) {
            case "Credit" -> factory.new CreditNotification();
            case "Debit" -> factory.new DebitNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }

    public static void main(String[] args) {
        day14_factory factory = new day14_factory();

        String type = "Credit";
        getNotification(factory, type)
                .send("240824", "Amount 800 Credited");
    }
}*/
public class day14_factory {

    interface Notification {
        void send(String to, String message);
    }

    class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: " + message + ", to " + to);
        }
    }

    class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Whatsapp: " + message + ", to " + to);
        }
    }

    static Notification getNotification(day14_factory factory, String type) {
        return switch (type) {
            case "Email" -> factory.new EmailNotification();
            case "Whatsapp" -> factory.new WhatsappNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }

    public static void main(String[] args) {
        day14_factory factory = new day14_factory();

        String type = "Whatsapp";
        getNotification(factory, type)
                .send("240824", "Hi Layaha");
    }
}