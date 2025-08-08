package 设计模式.职责链模式;

public class CEOLeader extends Leader{

    public CEOLeader(String position) {
        super(position);
    }

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 5){
        
            System.out.println("CEO批准: 同意。【请假单：姓名{" + leaveRequest.getName() + "}, 请假天数: {" + leaveRequest.getDays() + "} , 原因：{" + leaveRequest.getReason() + "} 】"
            );
            
        }else{
            if(nextLeader == null){

                System.out.println("该请假单不能被批准：{" + leaveRequest +  "} ");

                return;
            }
            nextLeader.process(leaveRequest);
        }
    }
}