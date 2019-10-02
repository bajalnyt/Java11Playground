package com.mohbajal;

import com.cronutils.descriptor.CronDescriptor;
import com.cronutils.model.Cron;
import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import com.cronutils.parser.CronParser;

import java.util.Locale;

import static com.cronutils.model.CronType.QUARTZ;

public class CronTester {

    public static void main(String[] args) {

        //get a predefined instance
        CronDefinition cronDefinition =
                CronDefinitionBuilder.instanceDefinitionFor(QUARTZ);

        //create a parser based on provided definition
        CronParser parser = new CronParser(cronDefinition);
        Cron quartzCron = parser.parse("0 * * 1-3 * ? *");

        //create a descriptor for a specific Locale
        CronDescriptor descriptor = CronDescriptor.instance(Locale.UK);

        //parse some expression and ask descriptor for description
        String description = descriptor.describe(parser.parse("0 0/70 * * * ?"));
        //description will be: "every 45 seconds"

        //validate expression
        quartzCron.validate();

        System.out.println(description);
    }
}
