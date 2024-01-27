package org.mygurukulam.template

import org.mygurukulam.common.*
import org.mygurukulam.ansible.*

def call(String name , Map config = [:]) {
  //def git = new org.mygurukulam.common.Checkout()
//def play = new org.mygurukulam.ansible.Playbook()
def hi = new org.mygurukulam.common.Hello()

//git.call(url, creds, branch)
//play.runAnsiblePlaybook(inventoryPath, testPlaybookPath)
hi.hello(name)
}


