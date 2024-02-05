package de.aittr.g_27_shop_project.scheduling;

import de.aittr.g_27_shop_project.domain.jpa.Task;
import de.aittr.g_27_shop_project.services.jpa.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@EnableAsync
public class ScheduleExecutor {

    private static Logger logger = LoggerFactory.getLogger(ScheduleExecutor.class);
    private TaskService taskService;

    public ScheduleExecutor(TaskService taskService) {
        this.taskService = taskService;
    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task");
//    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task 3000 ms");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    public void fixedRateTask() {
//        taskService.createTask("Fixed rate task 3000 ms");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    public void fixedRateTask() {
//        taskService.createTask("Fixed rate task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    @Async
//    public void fixedRateAsyncTask() {
//        taskService.createTask("Fixed rate async task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedDelay = 5000, initialDelay = 20000)
//    public void initialDelayTask() {
//        taskService.createTask("Initial delay task");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // 2 часа - 7 200 000 миллисекунд.
    // 7200000 -> PT02H

//    @Scheduled(fixedDelayString = "PT03S")
//    public void anotherDelayFormat() {
//        taskService.createTask("Another delay format task");
//    }

//    @Scheduled(fixedDelayString = "${interval}")
//    public void delayInPropertyTask() {
//        taskService.createTask("Delay in property task");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // 55 * * * * * - каждую минуту в 55 секунд
    // 0 0 8,10 * * * - каждый день в 8 и в 10 часов
    // 0 15 9-17 * * MON-FRI - в будни с 9 до 17 в 15 минут 0 секунд

//    @Scheduled(cron = "5-10 * * * * *")
//    public void cronExpressionTask() {
//        taskService.createTask("Cron expression task");
//    }

    public static void scheduleTaskExecution(Task task) {
        TaskScheduler scheduler = new DefaultManagedTaskScheduler();
        scheduler.schedule(() -> logger.info(task.getDescription()),
                new CronTrigger("0,10,20,30,40,50 * * * * *"));
    }
}