
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }

         ListNode dummy=new ListNode(0);
        dummy.next=head;
    
        ListNode current=head;
        ListNode previous=dummy;
        while(current != null && current.next != null) {
            
        if(current.val==current.next.val){

            while(current.next!=null && current.val==current.next.val) {
                current=current.next;
            }
                   previous.next=current.next;
            }else {
                previous=previous.next;   
        }
         current=current.next;
    }
    return dummy.next;
}
}