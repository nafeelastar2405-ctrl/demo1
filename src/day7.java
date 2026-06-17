public class day7 {
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }

        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }

        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }

    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }

        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("nafeela", "24-05-2008", "Fever");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("nafeela", "24-05-2008", "Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}  */
/*public class day7 {
    static class payment{
        String amount;

        void transfer(){
            System.out.println("pay");
        }
          static class upipayment extends payment {
              @Override
              void transfer() {
                  System.out.println(" upi payment");


              }
          }


          static class cardpayment extends payment {
              @Override
              void transfer() {
                  System.out.println("cardpayment ");
              }
           }
          static class NBpayment extends payment{
              @Override
              void transfer() {
                  System.out.println("NBpayment");
              }
          }
          static void main(){
              upipayment upipayment=new upipayment();
              upipayment.transfer();

              cardpayment cardpayment=new cardpayment();
              cardpayment.transfer();

              NBpayment NBpayment=new NBpayment();
              NBpayment.transfer();
          }

        }
     }
     }
 */
public class day7{

    interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "Nafeela";
        }

        @Override
        public String id() {
            return "101";
        }

        @Override
        public String Salary() {
            return "40000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "Reema";
        }

        @Override
        public String id() {
            return "105";
        }

        @Override
        public String Salary() {
            return "49000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();

        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}
