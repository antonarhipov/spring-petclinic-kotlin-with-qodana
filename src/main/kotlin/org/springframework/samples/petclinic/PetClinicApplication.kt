/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 * @author Antoine Rey
 */
@SpringBootApplication(proxyBeanMethods = false)
class PetClinicApplication

fun main(args: Array<String>) {
    runApplication<PetClinicApplication>(*args)
}

fun processParameters1(args: Array<String>) {
    println("Printing out parameters: ")
    for ((i, arg) in args.withIndex()) {
        when (i) {
            in 0..5 -> println("$i) $arg")
            in 5..10 -> println("$i: $arg")
            in 10..15 -> println("$i> $arg")
            in 15..20 -> println("$i~ $arg")
            else -> println("==== $i ====")
        }
    }
    println("Printing out parameters: ")
    println("finished!")
}

fun processParameters2(args: Array<String>) {
    println("Printing out parameters: ")
    for ((i, arg) in args.withIndex()) {
        when (i) {
            in 0..5 -> println("$i) $arg")
            in 5..10 -> println("$i: $arg")
            in 10..15 -> println("$i> $arg")
            in 15..20 -> println("$i~ $arg")
            else -> println("==== $i ====")
        }
    }
    println("Printing out parameters: ")
    println("done!")
}

