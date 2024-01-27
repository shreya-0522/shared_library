package org.mygurukulam.template

import org.mygurukulam.common.*
import org.mygurukulam.ansible.*

def call(String name , Map config = [:]) {
//def play = new org.mygurukulam.ansible.Playbook()
def hi = new org.mygurukulam.common.Hello()

//play.runAnsiblePlaybook(inventoryPath, testPlaybookPath)
hi.hello(name)
}

def checkout( String url ,String branch , Map config = [:] ) {
   def git = new org.mygurukulam.common.Checkout()
    git.call(url , branch)
}

def playrun(String inventoryPath, String testPlaybookPath) { 
   def play = new org.mygurukulam.ansible.Playbook()
   play.runAnsiblePlaybook(inventoryPath, testPlaybookPath)
}


