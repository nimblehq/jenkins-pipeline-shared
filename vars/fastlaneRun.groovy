import co.nimblehq.command.Summon
import co.nimblehq.command.fastlane.FastlaneRunCommand
import co.nimblehq.command.fastlane.FastlaneCommandSerializer

def call(Map args = [:], String lane) {
  FastlaneRunCommand fastlaneRunCommand = new FastlaneRunCommand()
  fastlaneRunCommand.lane = lane
  fastlaneRunCommand.parameters = args
  FastlaneCommandSerializer commandSerializer = new FastlaneCommandSerializer()
  sh Summon.bin(commandSerializer.serialize(fastlaneRunCommand))
}
