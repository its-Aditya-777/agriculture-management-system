import React, { useState, useEffect } from 'react';
import { AppBar, Box, IconButton, Toolbar, Typography } from '@mui/material';
import MenuIcon from '@mui/icons-material/Menu';
import LogoutIcon from '@mui/icons-material/Logout';
import { useProSidebar } from 'react-pro-sidebar';
import { useNavigate } from 'react-router-dom';
import { useNic } from '../NicContext'; // NIC context
import logo from '/src/assets/logo.jpg';

function AppHeader() {
    const navigate = useNavigate();
    const { collapseSidebar, toggleSidebar, broken } = useProSidebar();
    const { clearNic } = useNic();

    const [elevate, setElevate] = useState(false);

    // Add scroll listener for translucent effect
    useEffect(() => {
        const handleScroll = () => {
            if (window.scrollY > 20) {
                setElevate(true);
            } else {
                setElevate(false);
            }
        };
        window.addEventListener("scroll", handleScroll);
        return () => window.removeEventListener("scroll", handleScroll);
    }, []);

    const handleSignOut = () => {
        clearNic();
        navigate('/');
    };

    return (
        <AppBar
            position="sticky"
            sx={{
                bgcolor: elevate ? "rgba(46,125,50,0.85)" : "#2e7d32", // translucent green on scroll
                backdropFilter: elevate ? "blur(10px)" : "none", // blur effect
                transition: "all 0.3s ease",
                boxShadow: elevate ? "0 4px 20px rgba(0,0,0,0.2)" : "none",
            }}
        >
            <Toolbar>
                {/* Sidebar toggle */}
                <IconButton
                    onClick={() => (broken ? toggleSidebar() : collapseSidebar())}
                    color="inherit"
                >
                    <MenuIcon />
                </IconButton>

                {/* Logo + Title */}
                <Box
                    sx={{
                        display: "flex",
                        alignItems: "center",
                        ml: 2,
                        cursor: "pointer",
                        textDecoration: "none",
                    }}
                    component="a"
                    href="/"
                >
                    <img
                        src={logo}
                        alt="Gram Sewa"
                        style={{
                            width: 40,
                            height: 40,
                            marginRight: 10,
                            borderRadius: "50%",
                        }}
                    />
                    <Typography
                        variant="h6"
                        sx={{
                            fontWeight: "bold",
                            letterSpacing: 2,
                            color: "#fff",
                            "&:hover": {
                                color: "#c8e6c9",
                                textShadow: "0px 0px 8px #81c784",
                            },
                        }}
                    >
                        GRAM SEWA
                    </Typography>
                </Box>

                <Box sx={{ flexGrow: 1 }} />

                {/* Logout */}
                <IconButton title="Sign Out" color="inherit" onClick={handleSignOut}>
                    <LogoutIcon />
                </IconButton>
            </Toolbar>
        </AppBar>
    );
}

export default AppHeader;
