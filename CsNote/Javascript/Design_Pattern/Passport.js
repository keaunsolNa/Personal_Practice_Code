import passport from 'passport';
import { Strategy as LocalStrategy } from 'passport-local';

passport.use(new LocalStrategy(
    function (username, password, done) {
        UserActivation.findOne({ username: username}, function(err, user) {
            if(err) { return done(err); }

                if(!user) {
                    return done(null, false, { message: 'Incorect username.'
                });

                }

                if(!user.validPassword(password)) {
                    return done(null, false, { message: 'Incorect password.'
                });

                }

                return done(null, user);
        });
    }
));
    