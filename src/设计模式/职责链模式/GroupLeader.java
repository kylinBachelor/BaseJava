package 设计模式.职责链模式;

public class GroupLeader extends Leader {

    public GroupLeader(String position) {
        super(position);
    }

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 1){
             System.out.println("组长批准: 同意。【请假单：姓名{" + leaveRequest.getName() + "}, 请假天数: {" + leaveRequest.getDays() + "} , 原因：{" + leaveRequest.getReason() + "} 】"
            );
        }else {
            if(nextLeader == null){
                System.out.println("该请假单不能被批准：{" + leaveRequest +  "} ");

            }
            nextLeader.process(leaveRequest);
        }
    }
}