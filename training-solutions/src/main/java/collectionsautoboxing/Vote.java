package collectionsautoboxing;

import java.util.Map;
import java.util.TreeMap;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes){

        Map<VoteResult, Integer> result=new TreeMap<>();

        result.put(VoteResult.YES,getNumberOfVotes(VoteResult.YES,votes));
        result.put(VoteResult.NO,getNumberOfVotes(VoteResult.NO,votes));
        result.put(VoteResult.ABSTAIN,getNumberOfVotes(VoteResult.ABSTAIN,votes));

        return result;
    }

    private int getNumberOfVotes(VoteResult voteResult,Map<String, VoteResult> votes){

        int count=0;

        for (Map.Entry entries:votes.entrySet()) {
            if(entries.getValue()==voteResult){
                count++;
            }
        }return count;
    }
}
