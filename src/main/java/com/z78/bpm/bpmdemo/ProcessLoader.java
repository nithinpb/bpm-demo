package com.z78.bpm.bpmdemo;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.IdentityService;
import org.flowable.engine.RuntimeService;
import org.flowable.idm.api.Group;
import org.flowable.idm.api.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @author: nithinpb
 * @since: 7/22/17
 */
@Slf4j
@Service
public class ProcessLoader implements CommandLineRunner {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    IdentityService identityService;

    @Override
    public void run(String... strings) throws Exception {

        log.info("----- Loader Started ----------");
        callWaiterProcess();
        createUsers();
        log.info("----- Loader Completed --------");
    }

    private void createUsers() {
        Group group = identityService.newGroup("user");
        group.setName("users");
        group.setType("security-role");
        identityService.saveGroup(group);

        User nithin = identityService.newUser("nithin");
        nithin.setFirstName("Nithin");
        nithin.setLastName("Betegeri");
        nithin.setPassword("password");
        identityService.saveUser(nithin);

        User harsha = identityService.newUser("harsha");
        harsha.setFirstName("Sriharsha");
        harsha.setLastName("Setty");
        harsha.setPassword("password");
        identityService.saveUser(harsha);

        identityService.createMembership("nithin", "user");
        identityService.createMembership("harsha", "user");
    }

    private void callWaiterProcess() {
        runtimeService.startProcessInstanceByKey("waiter",
                Collections.singletonMap("customerId", 243L));
    }
}
