package controller;

import Repositories.DelegationRepository;
import Repositories.RoleRepository;
import Repositories.UsersRepository;
import Tables.Delegation;
import Tables.Users;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final UsersRepository uRepository;
    private final RoleRepository rRepository;
    private final DelegationRepository dRepository;
    Controller(UsersRepository uRepository, RoleRepository rRepository,DelegationRepository dRepository){
        this.uRepository = uRepository;
        this.rRepository = rRepository;
        this.dRepository = dRepository;
    }

    @PostMapping("/Users")
    void registerUser(@RequestBody Users u){
        uRepository.save(u);
    }
    @GetMapping("/Users")
    List<Users> getAllUsers(){
      return uRepository.findAll();
    }
    @PutMapping("/Users/{id}")
    void changePassword(@PathVariable int id, String newPassword){
        uRepository.findById(id).map(u ->{u.setPassword(newPassword);
                                        return uRepository.save(u);});
    }
    @DeleteMapping("/Users/{id}")
    boolean deleteUserById(@PathVariable int id){
        if(uRepository.findById(id)!=null) {
            uRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
    @PostMapping("/Delegation")
    void addDelegation(@PathVariable int userId, @PathVariable int delegationId){
        Delegation d;
        uRepository.findById(userId).map(u ->{u.addDelegation(dRepository.findById(delegationId));
            return uRepository.save(u);});
    }
    @DeleteMapping
    boolean removeDelegation(long userId, long delegationId){
        return true;
    }
    @PutMapping
    void changeDelegation(long delegationId, Delegation delegation){

    }
    @GetMapping("/Delegations")
    List<Delegation> getAllDelegations(){
        return dRepository.findAll();
    }
    @GetMapping("/Delegations")
    List<Delegation>getAllDelegationsOrderByDateStartDesc()
    {
        return dRepository.findAll();
    }
    @GetMapping
    List<Delegation> getAllDelegationsByUserOrderByDateStartDesc()
    {
        return dRepository.findAll();
    }
    @GetMapping("/Users/{role}")
    List<Users> getAllUsersByRoleName(@PathVariable String RoleName)
    {
        return uRepository.findAll();
    }
}
