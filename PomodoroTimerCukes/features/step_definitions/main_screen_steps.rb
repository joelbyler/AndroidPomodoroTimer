When /^I start the timer$/ do
  on(MainScreen).start_button
end

Then /^I should see the time plus (\d+) minutes$/ do |minutes|
  # TODO: see if its possible to do this using an accessor
  on(MainScreen).wait_for_text determine_expire_time minutes.to_i
	
end

def determine_expire_time (minutes=25)
	(Time.now + (minutes * 60)).strftime("%H:%M")
end
