public class P_skillTrees {

        public static int solution(String skill, String[] skill_trees) {
            int answer = 0;
            int treeLength = skill_trees.length;
            for(int i=0; i<treeLength; i++){
                int skillIndex=0;
                boolean flag = true;

                int treeIdxLength = skill_trees[i].length();
                for(int j=0; j<treeIdxLength; j++){

                    int skillLength = skill.length();
                    for(int k=skillIndex; k<skillLength; k++){
                        if(skill.charAt(k) == skill_trees[i].charAt(j)){
                            if(k!=skillIndex){
                                flag = false;
                            }else{
                                skillIndex++;
                            }

                        }
                    }
                }
                if(flag == true){
                    answer ++;
                }
            }
            return answer;
        }

        public static void main (String[] args) {
            String skill = "CBD";
            String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

            System.out.println(solution(skill, skill_trees));

        }
}
