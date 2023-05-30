package hoxton.multimodule;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private  final MemberDao memberDao;
    public List<Member> getAllMember(){
        return memberDao.findAll();
    };

    public void addMember(Member member){
        memberDao.save(member);
    }

}