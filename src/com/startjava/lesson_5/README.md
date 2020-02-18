## Execute SQL commands from a file in PostgreSQL

### Commands

Make a connection to PostgreSQL

    sudo -u postgres psql

**-u** - user
**postgres** - user name
**psql** - name of client (for terminal)

Then run

    \i fileName.sql

**\i** - means execute commands from file

